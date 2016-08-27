import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String timezone;
	public String description;
	public VersionModel _version;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String start_time;
	public String topic;
	public String name;
	public int id;
	public String organizer_name;
	public String privacy;
	public String end_time;
	public CopyrightModel _copyright;
	public String logo;
	public String state;
	public String code_of_conduct;

	public RootModel(String background_image, String schedule_published_on, CreatorModel creator, String timezone, String description, VersionModel version, String location_name, ArrayList<Social_linksModel> social_links, String type, String organizer_description, Call_for_papersModel call_for_papers, String email, String start_time, String topic, String name, int id, String organizer_name, String privacy, String end_time, CopyrightModel copyright, String logo, String state, String code_of_conduct) {

		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.timezone = timezone;
		this.description = description;
		this._version = version;
		this.location_name = location_name;
		this.social_links = social_links;
		this.type = type;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.start_time = start_time;
		this.topic = topic;
		this.name = name;
		this.id = id;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this._copyright = copyright;
		this.logo = logo;
		this.state = state;
		this.code_of_conduct = code_of_conduct;

	}

}