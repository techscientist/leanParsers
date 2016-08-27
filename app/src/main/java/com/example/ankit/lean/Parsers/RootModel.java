import java.util.ArrayList;

class RootModel {

	public String background_image;
	public CreatorModel _creator;
	public String organizer_description;
	public String location_name;
	public String schedule_published_on;
	public String privacy;
	public String type;
	public String email;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String name;
	public String state;
	public VersionModel _version;
	public int id;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String description;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String topic;
	public String code_of_conduct;

	public RootModel(String background_image, CreatorModel creator, String organizer_description, String location_name, String schedule_published_on, String privacy, String type, String email, String timezone, ArrayList<Social_linksModel> social_links, String end_time, String name, String state, VersionModel version, int id, CopyrightModel copyright, String organizer_name, String description, String logo, Call_for_papersModel call_for_papers, String start_time, String topic, String code_of_conduct) {

		this.background_image = background_image;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.type = type;
		this.email = email;
		this.timezone = timezone;
		this.social_links = social_links;
		this.end_time = end_time;
		this.name = name;
		this.state = state;
		this._version = version;
		this.id = id;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.description = description;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;

	}

}