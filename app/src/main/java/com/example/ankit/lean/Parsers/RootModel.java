import java.util.ArrayList;

class RootModel {

	public String type;
	public String location_name;
	public String background_image;
	public String email;
	public String end_time;
	public String organizer_name;
	public String start_time;
	public String topic;
	public String timezone;
	public String name;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public CopyrightModel _copyright;
	public int id;
	public String privacy;
	public VersionModel _version;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String code_of_conduct;

	public RootModel(String type, String location_name, String background_image, String email, String end_time, String organizer_name, String start_time, String topic, String timezone, String name, String state, Call_for_papersModel call_for_papers, String organizer_description, CopyrightModel copyright, int id, String privacy, VersionModel version, CreatorModel creator, String schedule_published_on, String description, ArrayList<Social_linksModel> social_links, String logo, String code_of_conduct) {

		this.type = type;
		this.location_name = location_name;
		this.background_image = background_image;
		this.email = email;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.topic = topic;
		this.timezone = timezone;
		this.name = name;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.id = id;
		this.privacy = privacy;
		this._version = version;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.social_links = social_links;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;

	}

}