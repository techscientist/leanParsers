import java.util.ArrayList;

class RootModel {

	public String location_name;
	public int id;
	public String timezone;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String logo;
	public String start_time;
	public String topic;
	public String description;
	public String organizer_description;
	public String state;
	public CreatorModel _creator;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String privacy;
	public String type;
	public String name;
	public String email;
	public String organizer_name;
	public String schedule_published_on;
	public String code_of_conduct;

	public RootModel(String location_name, int id, String timezone, CopyrightModel copyright, Call_for_papersModel call_for_papers, String background_image, String logo, String start_time, String topic, String description, String organizer_description, String state, CreatorModel creator, String end_time, ArrayList<Social_linksModel> social_links, VersionModel version, String privacy, String type, String name, String email, String organizer_name, String schedule_published_on, String code_of_conduct) {

		this.location_name = location_name;
		this.id = id;
		this.timezone = timezone;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.logo = logo;
		this.start_time = start_time;
		this.topic = topic;
		this.description = description;
		this.organizer_description = organizer_description;
		this.state = state;
		this._creator = creator;
		this.end_time = end_time;
		this.social_links = social_links;
		this._version = version;
		this.privacy = privacy;
		this.type = type;
		this.name = name;
		this.email = email;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;

	}

}