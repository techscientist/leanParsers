import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String background_image;
	public String start_time;
	public String privacy;
	public CreatorModel _creator;
	public String email;
	public String end_time;
	public String description;
	public String organizer_name;
	public String logo;
	public VersionModel _version;
	public String topic;
	public String organizer_description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String schedule_published_on;
	public String timezone;
	public CopyrightModel _copyright;
	public String name;
	public int id;
	public String state;

	public RootModel(ArrayList<Social_linksModel> social_links, String location_name, String background_image, String start_time, String privacy, CreatorModel creator, String email, String end_time, String description, String organizer_name, String logo, VersionModel version, String topic, String organizer_description, String code_of_conduct, Call_for_papersModel call_for_papers, String type, String schedule_published_on, String timezone, CopyrightModel copyright, String name, int id, String state) {

		this.social_links = social_links;
		this.location_name = location_name;
		this.background_image = background_image;
		this.start_time = start_time;
		this.privacy = privacy;
		this._creator = creator;
		this.email = email;
		this.end_time = end_time;
		this.description = description;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this._version = version;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this._copyright = copyright;
		this.name = name;
		this.id = id;
		this.state = state;

	}

}