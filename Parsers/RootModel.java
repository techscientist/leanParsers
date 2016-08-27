import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String location_name;
	public String start_time;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String organizer_name;
	public String logo;
	public String timezone;
	public String privacy;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public VersionModel _version;
	public String end_time;
	public int id;
	public CreatorModel _creator;
	public String description;
	public String topic;
	public String name;
	public String state;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;

	public RootModel(String background_image, String location_name, String start_time, String email, ArrayList<Social_linksModel> social_links, String type, String organizer_name, String logo, String timezone, String privacy, CopyrightModel copyright, String schedule_published_on, VersionModel version, String end_time, int id, CreatorModel creator, String description, String topic, String name, String state, String organizer_description, Call_for_papersModel call_for_papers, String code_of_conduct) {

		this.background_image = background_image;
		this.location_name = location_name;
		this.start_time = start_time;
		this.email = email;
		this.social_links = social_links;
		this.type = type;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.timezone = timezone;
		this.privacy = privacy;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.end_time = end_time;
		this.id = id;
		this._creator = creator;
		this.description = description;
		this.topic = topic;
		this.name = name;
		this.state = state;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;

	}

}