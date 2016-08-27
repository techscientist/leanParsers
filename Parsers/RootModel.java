import java.util.ArrayList;

class RootModel {

	public String start_time;
	public int id;
	public String code_of_conduct;
	public VersionModel _version;
	public String background_image;
	public CreatorModel _creator;
	public String location_name;
	public String email;
	public String description;
	public String privacy;
	public CopyrightModel _copyright;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String name;
	public String organizer_description;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String timezone;
	public String state;
	public String type;
	public String logo;

	public RootModel(String start_time, int id, String code_of_conduct, VersionModel version, String background_image, CreatorModel creator, String location_name, String email, String description, String privacy, CopyrightModel copyright, String organizer_name, ArrayList<Social_linksModel> social_links, String schedule_published_on, String name, String organizer_description, String topic, Call_for_papersModel call_for_papers, String end_time, String timezone, String state, String type, String logo) {

		this.start_time = start_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.background_image = background_image;
		this._creator = creator;
		this.location_name = location_name;
		this.email = email;
		this.description = description;
		this.privacy = privacy;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.timezone = timezone;
		this.state = state;
		this.type = type;
		this.logo = logo;

	}

}