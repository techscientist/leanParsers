import java.util.ArrayList;

class RootModel {

	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String organizer_name;
	public String topic;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String end_time;
	public String email;
	public String background_image;
	public CreatorModel _creator;
	public String logo;
	public String state;
	public String description;
	public String privacy;
	public String start_time;
	public String name;
	public int id;
	public String location_name;
	public VersionModel _version;

	public RootModel(String type, ArrayList<Social_linksModel> social_links, String organizer_description, String organizer_name, String topic, CopyrightModel copyright, String schedule_published_on, String code_of_conduct, Call_for_papersModel call_for_papers, String timezone, String end_time, String email, String background_image, CreatorModel creator, String logo, String state, String description, String privacy, String start_time, String name, int id, String location_name, VersionModel version) {

		this.type = type;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.end_time = end_time;
		this.email = email;
		this.background_image = background_image;
		this._creator = creator;
		this.logo = logo;
		this.state = state;
		this.description = description;
		this.privacy = privacy;
		this.start_time = start_time;
		this.name = name;
		this.id = id;
		this.location_name = location_name;
		this._version = version;

	}

}